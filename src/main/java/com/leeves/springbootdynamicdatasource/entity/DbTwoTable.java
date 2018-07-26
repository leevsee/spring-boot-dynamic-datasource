package com.leeves.springbootdynamicdatasource.entity;

/**
 * <p>
 * 
 * </p>
 *
 * @author Leeves
 * @since 2018-07-04
 */
public class DbTwoTable {

    private Long id;
    private String gender;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "DbTwoTable{" +
                "id=" + id +
                ", gender='" + gender + '\'' +
                '}';
    }
}
