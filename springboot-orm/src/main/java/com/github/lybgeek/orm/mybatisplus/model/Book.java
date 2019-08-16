package com.github.lybgeek.orm.mybatisplus.model;

import java.math.BigDecimal;
import com.github.lybgeek.orm.common.model.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author lyb-geek
 * @since 2019-08-15
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString(callSuper = true)
public class Book extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private String bookName;

    private String author;

    private String description;

    private BigDecimal price;

    private Integer stock;


}
