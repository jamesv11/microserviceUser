package co.com.microserviceuser.jpa;

import co.com.microserviceuser.jpa.model.UserModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface JPARepository extends CrudRepository<UserModel, Integer>, QueryByExampleExecutor<UserModel> {

}
