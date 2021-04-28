package com.mulun.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


/**
 * @author MuLun
 * @EnableWebSecurity 开启WebSecurity模式
 */
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    /**
     * 授权
     *
     * @param http
     * @throws Exception
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //首页所有人可以访问，功能页只有对应有权限的人才能访问

        //authorizeRequests：认证请求
        //请求授权的规则
        //antMatchers("/")：自定义要设置访问权限的页面
        //permitAll()：所有人都可以访问
        //hasRole("vip1")：自定义该页面访问的级别
        http.authorizeRequests()
                .antMatchers("/").permitAll()
                .antMatchers("/level1/**").hasRole("vip1")
                .antMatchers("/level2/**").hasRole("vip2")
                .antMatchers("/level3/**").hasRole("vip3");

        //没有权限会到登录页面，需要开启登录的页面 --- 定制登录页
        //loginProcessingUrl("/login")：表示登录验证的是哪个页面
        //loginProcessingUrl("/toLogin")：自定义登录页面路径
        //usernameParameter("username")：自定义接收的用户名密码，默认是username和password
        http.formLogin()
                .loginProcessingUrl("/toLogin")
                .loginProcessingUrl("/login")
                .usernameParameter("username")
                .passwordParameter("password");


        //关闭跨站攻击防御 --》注销失败可能存在的原因，可以关掉防御试试能不能注销
//        http.csrf().disable();


        //rememberMe()：开启记住我功能，默认保存两周。（保存到Cookie中，浏览器清理Cookie则失效）
        //rememberMeParameter("remember")：自定义接收前端的参数（你的记住我‘单选框or复选框...’的name）
        http.rememberMe().rememberMeParameter("remember");


        //开启注销,注销成功后跳到首页
        //logoutSuccessUrl("/")：自定义注销后要跳转的页面
        http.logout().logoutSuccessUrl("/");
        //移除Cookies，清空Session
//        http.logout().deleteCookies("remove").invalidateHttpSession(true);
    }

    /**
     * 认证
     *
     * @param auth
     * @throws Exception
     */
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        //注意，设置password()时需要进行加密编码，如果没有加密则会报错。
        //可以使用提供的加密方式：new BCryptPasswordEncoder().encode("123456")，当然还有很多的别加密规则，如MD5等。
        auth.inMemoryAuthentication().passwordEncoder(new BCryptPasswordEncoder())
                .withUser("admin").password(new BCryptPasswordEncoder().encode("123456")).roles("vip1", "vip2", "vip3")
                .and()
                .withUser("mulun").password(new BCryptPasswordEncoder().encode("123456")).roles("vip1");
    }
}
