package spring.boot.core.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import spring.boot.core.domain.User;

public interface UserService {
    /**
     * 获取用户分页列表
     *
     * @param pageable
     * @return
     */
    Page<User> findByPage(Pageable pageable);

    /**
     * 新增用户
     *
     * @param user
     * @return
     */
    User insertByUser(User user);
}
