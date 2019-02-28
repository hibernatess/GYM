package com.gym.ssm.service;


import com.gym.ssm.entity.Dictionaries;

import java.util.List;
import java.util.Map;

/**
 * @Description: 基础数据类型
 * @Param:
 * @return:
 * @Author: ywj
 * @Date: 2019/2/26 0026
 */
public interface DictionariesBiz {
    /**
     * @Description: 增加基本数据类型
     * @Param: []
     * @return: int
     * @Author: ywj
     * @Date: 2019/2/26 0026
     */
    public int PostDictionaries(Dictionaries dictionaries);
     /**    
         *@Description: 删除基础数据
         * @Param: []
         * @return: int
         * @Author: ywj
         * @Date: 2019/2/26 0026
         */
    public  int DleteDictionaries(Dictionaries dictionaries);
    
    
    
    /**    
        *@Description: 修改基础数据
        * @Param: []
        * @return: int
        * @Author: ywj
        * @Date: 2019/2/26 0026
        */
    public  int PutDictionaries(Dictionaries dictionaries);

    /**    
        *@Description: 查询基础数据类型
        * @Param: [dictionaries]
        * @return: java.util.List<java.util.Map<java.lang.String,java.lang.Object>>
        * @Author: ywj
        * @Date: 2019/2/26 0026
        */
    public List<Dictionaries> GetDictionaries(Dictionaries dictionaries);

}
