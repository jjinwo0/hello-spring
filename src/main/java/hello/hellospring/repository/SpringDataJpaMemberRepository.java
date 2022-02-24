package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

//개발자가 직접 스프링 빈을 등록하지 않고,
//SpringDataJpa가 구현체를 만들어서(JpaRepository) 등록해줌
public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository {

    //select m from Member m where m.name = ?
    @Override
    Optional<Member> findByName(String name);
}
