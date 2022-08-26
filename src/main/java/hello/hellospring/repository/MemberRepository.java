package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member); //저장
    Optional<Member> findById(Long id); //id를 찾아올수있음
    Optional<Member> findByName(String name); //이름을 찾아올수 있음
    List<Member> findAll(); //저장된 모든 리스트
}
