package com.caixin.data.middle.etl.kettle.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
* Created by Mybatis Generator on 2020年02月07日 上午 07:59:41
*/
@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class RTransformation implements Serializable {
    /**
     * <pre>
     * 表字段： r_transformation.ID_TRANSFORMATION
     * </pre>
     */
    private Long idTransformation;

    /**
     * <pre>
     * 表字段： r_transformation.ID_DIRECTORY
     * </pre>
     */
    private Integer idDirectory;

    /**
     * <pre>
     * 表字段： r_transformation.NAME
     * </pre>
     */
    private String name;

    /**
     * <pre>
     * 表字段： r_transformation.TRANS_VERSION
     * </pre>
     */
    private String transVersion;

    /**
     * <pre>
     * 表字段： r_transformation.TRANS_STATUS
     * </pre>
     */
    private Integer transStatus;

    /**
     * <pre>
     * 表字段： r_transformation.ID_STEP_READ
     * </pre>
     */
    private Integer idStepRead;

    /**
     * <pre>
     * 表字段： r_transformation.ID_STEP_WRITE
     * </pre>
     */
    private Integer idStepWrite;

    /**
     * <pre>
     * 表字段： r_transformation.ID_STEP_INPUT
     * </pre>
     */
    private Integer idStepInput;

    /**
     * <pre>
     * 表字段： r_transformation.ID_STEP_OUTPUT
     * </pre>
     */
    private Integer idStepOutput;

    /**
     * <pre>
     * 表字段： r_transformation.ID_STEP_UPDATE
     * </pre>
     */
    private Integer idStepUpdate;

    /**
     * <pre>
     * 表字段： r_transformation.ID_DATABASE_LOG
     * </pre>
     */
    private Integer idDatabaseLog;

    /**
     * <pre>
     * 表字段： r_transformation.TABLE_NAME_LOG
     * </pre>
     */
    private String tableNameLog;

    /**
     * <pre>
     * 表字段： r_transformation.USE_BATCHID
     * </pre>
     */
    private String useBatchid;

    /**
     * <pre>
     * 表字段： r_transformation.USE_LOGFIELD
     * </pre>
     */
    private String useLogfield;

    /**
     * <pre>
     * 表字段： r_transformation.ID_DATABASE_MAXDATE
     * </pre>
     */
    private Integer idDatabaseMaxdate;

    /**
     * <pre>
     * 表字段： r_transformation.TABLE_NAME_MAXDATE
     * </pre>
     */
    private String tableNameMaxdate;

    /**
     * <pre>
     * 表字段： r_transformation.FIELD_NAME_MAXDATE
     * </pre>
     */
    private String fieldNameMaxdate;

    /**
     * <pre>
     * 表字段： r_transformation.OFFSET_MAXDATE
     * </pre>
     */
    private Double offsetMaxdate;

    /**
     * <pre>
     * 表字段： r_transformation.DIFF_MAXDATE
     * </pre>
     */
    private Double diffMaxdate;

    /**
     * <pre>
     * 表字段： r_transformation.CREATED_USER
     * </pre>
     */
    private String createdUser;

    /**
     * <pre>
     * 表字段： r_transformation.CREATED_DATE
     * </pre>
     */
    private Date createdDate;

    /**
     * <pre>
     * 表字段： r_transformation.MODIFIED_USER
     * </pre>
     */
    private String modifiedUser;

    /**
     * <pre>
     * 表字段： r_transformation.MODIFIED_DATE
     * </pre>
     */
    private Date modifiedDate;

    /**
     * <pre>
     * 表字段： r_transformation.SIZE_ROWSET
     * </pre>
     */
    private Integer sizeRowset;

    /**
     * <pre>
     * 表字段： r_transformation.DESCRIPTION
     * </pre>
     */
    private String description;

    /**
     * <pre>
     * 表字段： r_transformation.EXTENDED_DESCRIPTION
     * </pre>
     */
    private String extendedDescription;

    private static final long serialVersionUID = 1L;
}