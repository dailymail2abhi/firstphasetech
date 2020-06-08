package com.tech.firstphase.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.cassandra.core.CassandraOperations;
import org.springframework.stereotype.Repository;

import com.tech.firstphase.config.Students;

@Repository
public class CassandraRepository {

	@Autowired
	CassandraOperations cassandraTemplate;
	
	public Students fetchDataFromCassandra(int id) {
		System.out.println(id);
		System.out.println(cassandraTemplate);
		Students  student = cassandraTemplate.selectOneById(id, Students.class);
		System.out.println(student);
		return student;
	}
}
