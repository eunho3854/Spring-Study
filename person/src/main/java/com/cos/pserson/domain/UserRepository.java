package com.cos.pserson.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

// 메모리에 한 번 뜸.
@Repository
public class UserRepository {
	
	public List<User> findAll() {
		List<User> users = new ArrayList<>();
		users.add(new User(1, "ssar", "1234", "0102222"));
		users.add(new User(2, "cos", "1234", "0102222"));
		users.add(new User(3, "love", "1234", "0102222"));
		return users;
	}
	
	public User findById(int id) {
		return new User(1, "ssar", "1234", "0102222");
	}
	
	public void save(JoinReqDto dto) {
		System.out.println("DB에 Insert 하기");
	}
	
	// DAO 연결해서 실행하다가 인섹션 터지면 안 넘어감. 그래서 void를 해도 괜찮음.
	public void delete(int id) {
		System.out.println("DB에 삭제하기");
	}
	
	public void update(int id, UpdateReqDto dto) {
		System.out.println("DB에 수정하기");
	}
}
