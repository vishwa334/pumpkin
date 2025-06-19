package com.codeIntern.pumbkin.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.codeIntern.pumbkin.model.Test;

@Repository
public interface Test1 extends JpaRepository<Test,String> {
}
