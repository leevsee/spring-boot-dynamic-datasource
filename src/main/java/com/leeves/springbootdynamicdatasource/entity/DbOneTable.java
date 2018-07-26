package com.leeves.springbootdynamicdatasource.entity;



/**
 * <p>
 * 
 * </p>
 *
 * @author Leeves
 * @since 2018-07-04
 */
public class DbOneTable {

    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "DbOneTable{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
