package com.mvc.domain;

import java.util.List;

import javax.persistence.EntityManagerFactory;

import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;

import org.hibernate.ejb.EntityManagerFactoryImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.EntityManagerFactoryInfo;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:**/WEB-INF/mvc-dispatcher-servlet.xml"})
public class DomainTest {
	

static final Logger LOG = LoggerFactory.getLogger(DomainTest.class);
	
	
	
	@Before
	public void init(){
		
		
		
	}
	
	
	
	@Test
	public void test(){
		
		System.out.println("running");
		
	}

	

}
