package org.wuancake.entity;

import java.io.Serializable;

/**
 * @author
 * @date
 */
public class GroupBean implements Serializable {

    private Integer groupId;
    private String groupName;

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
}
