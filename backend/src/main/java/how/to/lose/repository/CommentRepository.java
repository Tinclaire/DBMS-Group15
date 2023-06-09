package how.to.lose.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import how.to.lose.model.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long>{

}
