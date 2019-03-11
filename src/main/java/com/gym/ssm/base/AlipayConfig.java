package com.gym.ssm.base;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {

//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id ="2016092700611273";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key ="MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQC2My8rzko8pL6JZ0Tu3oe0Fgu4qn598Wfuii34yKfY1oHDHbQWIipCcZdcWoeqIITYbXLKR0NN6ZPhf9gVdXndZJSGgy3+qTNEJeME1H5lh24Vhxk93FWRuQT4Byk4t8J3QeBTkYpZZdxAaLGDvmXKcnLQCT7qDGNyvx3imue/vcZUiOBZxS07OvT+YoQpZVyXDtBy5Yj4x62Ko5c/mbvZW+DIqAE8CS8MBJv/yO5jJvuJfPMdaaXcymGDAtdcuk5qjenAh+DyCJMPrx+mt6JE9HLF5H7ee7AvFopF2e4KXsv1nnCrIzOJbZca4e1bzVMDzjtyUSYFynA34wIM0IzLAgMBAAECggEADzctDEp49qGHa/Ac2Jnq2UYyCmTqlVfwpwIRHsKbCce4JHQ5ktOdldjonATPaYy3q19Qg8X5v+rut5k2kWwzFiMNKEKSN78nkdxcHg4k1BPARLn4iKr61mWOHaxza9IkwlLVCgWQeTDBePuFP4xJ8eMm5WqwP1lzgKSnOUJYcjGh6NVEpP4qCcu4O65UntAHkL93XCl5Fqg/YDxg91pci7IBFm67eSnTSDBvgCOCXAgMMUm+739v2VYNMPPSut5z9RKH7gbMyl0yMDNtFjwPLl6D5PQNVyD23EJGAQ055SBehSJQ9J06VZtP4+mukqdWxUQ2X5rOElKive1eDUenUQKBgQDZZCco9hH0rTPWl9rQtykYdUikGqKhkQYhoO4Awz8EXAM715DiTmnPuxXOTDEzZIDIRIN8gP9wLtBQzss6biNW7UwengPeXbtFl5OevbHaUCEfnIsGw19XmldNAchGGY1aWc8aU4AEgcVTmqL9v/SQQCronYQlnks0MTTs3oU5aQKBgQDWjwjSRd3U4QSjaPuYc0flPFdDs/LEOW7YveR+aL2CrYuvogCIaTA2wu/Y2ppHn0F7qVtOa3iBsyBxY0uxwuSrFL0Xrfb95OVjqzQv9V1HHiRfrOIt0ZDo9xvXd9aU4wHTZEupRx4EeOqRRwNeW0EkluAB9zgJwNnhrVWhzZ+6EwKBgBAYLh4GOcYXnKLikzyoks5QwJQFtMypY/7RX02HJv83oLWpe/yFOag7fZ3MXkgjxLUO/X0WP9MaZCnXZYxp4wvofZ42rKql3duFIVS7TpOPIySn/lL92+0sbBIzc5RdB+4MgBy+2dd7lBRgeni24XBcj9Cw+LugQIkYq4Zt4wchAoGAeFIeEE096XOGtlzZOtTrLJJ6HW18Zq4Oi11yFbGHFRFdlFC1G8phT1RiTKnKev/EKSUAHyoFmjZpqyyT9kvlEEvA/tZ//EGwogQQcBSZCpjMrRq2fBtZuEtbQanim/vxuio0g+lt2/QzFuVL7k4eafZyCKgqtM2BYh1iOCqnuCECgYAaWpX7XUpOOJsvshpRWsI8eUgpRrEkr8gDhZDAUIgGTTotO4jFQBbhG4td09I2UGJG0ASau3nAhlz1GDv2gBAfSaySUBsKMaVfaKjGmlNoqFep/cQ60+oNwdT0HU1Xu1PVzWYpZBA4BTb0h7UUTLvGeroW5Ca3AMDz62UEXJEdQQ==";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key ="MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA2+s8/W5FrPQ/A4H+zjLQfE+yWfWkIa1NQsEyJ7rm8gMlDDBMzuLHvRqjWeZS8FAvYkxjOjGhSWU12SQD63v5pDU6/uTNPeNXPa0NmMZbZ84KKAKgiKvLQjKguN00qnMlpldbIEBavq73xxI2sXLcmHlWUk22VrE40IPwfRy8oxiHcUmvdJOUztv8jkEeGlL/oSPEXLR0a2RXGcCC0z2IHvbhOciYQpSe1p9tplpbXF43S1jX7JRsjCCzbr+8pJAhDXCOJB7W+E4cP6SDmAlL/p4zU8RlE1mIcURGB5AF0ARdJ+BrxkFh1j5IiApxebLWBXf1SWlRwIkVRRAvZ4SF2wIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "";
    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    // 支付宝网关
    public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

