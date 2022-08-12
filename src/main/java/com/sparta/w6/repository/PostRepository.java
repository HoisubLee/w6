package com.sparta.w6.repository;


import com.sparta.w6.domain.Member;
import com.sparta.w6.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
  List<Post> findAllByOrderByModifiedAtDesc();
  List<Post> findByMember(Member member);
}