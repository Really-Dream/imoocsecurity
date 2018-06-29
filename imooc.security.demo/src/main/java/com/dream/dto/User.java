package com.dream.dto;

import com.dream.validator.MyConstraint;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.Setter;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import java.util.Date;

/**
 * Created by H.J
 * 2018/6/28
 */
@Setter
public class User {
    public interface UserSimpleView {}
    public interface UserDetailView extends UserSimpleView {}

    private String id;

    @MyConstraint
    private String username;

    @NotBlank(message = "密码不能为空")
    private String password;

    @Past(message = "生日日期不能大于当前时间")
    private Date birthday;

    @JsonView(UserSimpleView.class)
    public String getUsername() {
        return username;
    }

    @JsonView(UserDetailView.class)
    public String getPassword() {
        return password;
    }

    @JsonView(UserSimpleView.class)
    public String getId() {
        return id;
    }

    @JsonView(UserSimpleView.class)
    public Date getBirthday() {
        return birthday;
    }
}
