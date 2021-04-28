package com.mulun.mapper;

import com.mulun.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {

    /**
     * 获取所有用户信息
     *
     * @return
     */
    public List<User> listUsers();

    /**
     * 通过ID获取用户
     *
     * @param id
     * @return 用户对象
     */
    public User getUserById(@Param("id") Integer id);

    /**
     * 插入一条数据
     *
     * @param user
     * @return 影响行数
     */
    public Integer insertUser(User user);

    /**
     * 修改用户信息
     *
     * @param user
     * @return
     */
    public Integer updateUser(User user);

    /**
     * 根据ID删除数据
     *
     * @param id
     * @return
     */
    public Integer deleteUserById(@Param("id") Integer id);
}
