package com.ssafy.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssafy.api.request.UserRegisterPostReq;
import com.ssafy.db.entity.User;
import com.ssafy.db.repository.UserRepository;

/**
 *	유저 관련 비즈니스 로직 처리를 위한 서비스 구현 정의.
 */
@Service("userService")
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository userRepository;

	
//	@Autowired
//	PasswordEncoder passwordEncoder;
//	
	@Transactional 
	public User createUser(UserRegisterPostReq userRegisterInfo) {
		User user = new User();
//		user.setUserId(userRegisterInfo.getId());
//		// 보안을 위해서 유저 패스워드 암호화 하여 디비에 저장.
//		user.setPassword(passwordEncoder.encode(userRegisterInfo.getPassword()));
		return userRepository.save(user);
	}

	public User findByUserEmail(String userEmail) {
		// 디비에 유저 정보 조회 (userId 를 통한 조회).
		User user = userRepository.findByUserEmail(userEmail).get();
		return user;
	}
}