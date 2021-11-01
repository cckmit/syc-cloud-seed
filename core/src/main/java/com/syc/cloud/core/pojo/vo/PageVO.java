package com.syc.cloud.core.pojo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author 33992
 * @since 2021/10/26
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageVO<T> {

    private Long total;

    private List<T> rows;
}
