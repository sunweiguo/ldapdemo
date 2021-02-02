package com.swg.demo.dao;

import com.swg.demo.bean.Person;
import org.springframework.ldap.core.AttributesMapper;
import org.springframework.stereotype.Component;

import javax.naming.NamingException;
import javax.naming.directory.Attributes;

/**
 * <p>
 *
 * </p>
 *
 * @author xiachaoyang
 * @version V1.0
 * @date 2018年10月08日 17:17
 * @modificationHistory=========================逻辑或功能性重大变更记录
 * @modify By: {修改人} 2018年10月08日
 * @modify reason: {方法名}:{原因}
 * ...
 */
@Component
public class PersonAttributesMapper implements AttributesMapper<Person> {
    /**
     * Map Attributes to an object. The supplied attributes are the attributes
     * from a single SearchResult.
     *
     * @param attrs attributes from a SearchResult.
     * @return an object built from the attributes.
     * @throws NamingException if any error occurs mapping the attributes
     */
    @Override
    public Person mapFromAttributes(Attributes attrs) throws NamingException {
        Person person = new Person();
        person.setPersonName((String)attrs.get("cn").get());
//        person.setOrgId((String)attrs.get("orgId").get());
        return person;
    }
}

