package com.kodilla.hibernate.tasklist;

import com.sun.istack.internal.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "TASKKILSTS")
public class TaskList {
    private int id;
    private String listName;
    private String descripton;

    public TaskList(String listName, String descripton) {
        this.listName = listName;
        this.descripton = descripton;
    }

    public TaskList() {
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(unique = true)
    public int getId() {
        return id;
    }

    @Column
    public String getListName() {
        return listName;
    }

    @Column
    public String getDescripton() {
        return descripton;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setListName(String listName) {
        this.listName = listName;
    }

    private void setDescripton(String descripton) {
        this.descripton = descripton;
    }
}
