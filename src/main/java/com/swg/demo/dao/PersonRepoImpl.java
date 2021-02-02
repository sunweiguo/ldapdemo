package com.swg.demo.dao;

import com.swg.demo.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ldap.core.AttributesMapper;
import org.springframework.ldap.core.LdapTemplate;
import org.springframework.ldap.query.LdapQuery;
import org.springframework.stereotype.Component;

import javax.naming.Context;
import javax.naming.NameNotFoundException;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.*;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;

import static org.springframework.ldap.query.LdapQueryBuilder.query;

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
@Component
public class PersonRepoImpl implements IPersonRepo {

    @Autowired
    private LdapTemplate ldapTemplate;

    /**
     * 查询对象映射集合
     * @return
     */
    @Override
    public List<Person> getAllPersons() {
        return ldapTemplate.search(query()
                .where("objectclass").is("organizationalRole"), new PersonAttributesMapper());
    }

}


