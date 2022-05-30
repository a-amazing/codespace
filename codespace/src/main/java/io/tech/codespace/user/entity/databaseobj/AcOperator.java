package io.tech.codespace.user.entity.databaseobj;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity()
@Table(name="AC_OPERATOR")
@Data
public class AcOperator {
    @Id
    @Column(name="operatorid",unique=true)
    private Long operatorid;

    @Column(name="userid")
    private String userid;

    @Column(name="operatorname")
    private String operatorname;

    @Column(name="password")
    private String password;

    @Column(name="email")
    private String email;
}
