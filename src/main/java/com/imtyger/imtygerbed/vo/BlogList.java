package com.imtyger.imtygerbed.vo;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import java.util.Date;

/**
 * Created by 910888783@qq.com on 2019/11/22.
 */
@Getter
@Setter
public class BlogList {

    @NotEmpty
    private String id;

    @NotEmpty
    private String title;

    @NotEmpty
    private Date createdAt;
}
