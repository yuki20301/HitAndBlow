package jp.eightbit.exam.UserDataRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jp.eightbit.exam.UserEntity.UserEntity;

@Repository
public interface UserDataRepository extends JpaRepository<UserEntity, Long>{
	
		UserEntity findByEmail(String email);

}