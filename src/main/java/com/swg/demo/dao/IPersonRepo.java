package com.swg.demo.dao;


import com.swg.demo.bean.Person;
import org.springframework.ldap.core.LdapTemplate;

import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @author xiachaoyang
 * @version V1.0
 * @date 2018年10月08日 15:24
 * @modificationHistory=========================逻辑或功能性重大变更记录
 * @modify By: {修改人} 2018年10月08日
 * @modify reason: {方法名}:{原因}
 * ...
 */
public interface IPersonRepo {
    List<Person> getAllPersons();
}


