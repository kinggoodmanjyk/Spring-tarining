package dao.model;

import java.util.Date;

public class resource {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resource.id
     *
     * @mbg.generated Mon Apr 23 16:56:45 CST 2018
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resource.name
     *
     * @mbg.generated Mon Apr 23 16:56:45 CST 2018
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resource.url
     *
     * @mbg.generated Mon Apr 23 16:56:45 CST 2018
     */
    private String url;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resource.open_mode
     *
     * @mbg.generated Mon Apr 23 16:56:45 CST 2018
     */
    private String openMode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resource.description
     *
     * @mbg.generated Mon Apr 23 16:56:45 CST 2018
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resource.icon
     *
     * @mbg.generated Mon Apr 23 16:56:45 CST 2018
     */
    private String icon;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resource.pid
     *
     * @mbg.generated Mon Apr 23 16:56:45 CST 2018
     */
    private Long pid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resource.seq
     *
     * @mbg.generated Mon Apr 23 16:56:45 CST 2018
     */
    private Byte seq;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resource.status
     *
     * @mbg.generated Mon Apr 23 16:56:45 CST 2018
     */
    private Byte status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resource.opened
     *
     * @mbg.generated Mon Apr 23 16:56:45 CST 2018
     */
    private Byte opened;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resource.resource_type
     *
     * @mbg.generated Mon Apr 23 16:56:45 CST 2018
     */
    private Byte resourceType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resource.create_time
     *
     * @mbg.generated Mon Apr 23 16:56:45 CST 2018
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resource.id
     *
     * @return the value of resource.id
     *
     * @mbg.generated Mon Apr 23 16:56:45 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resource.id
     *
     * @param id the value for resource.id
     *
     * @mbg.generated Mon Apr 23 16:56:45 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resource.name
     *
     * @return the value of resource.name
     *
     * @mbg.generated Mon Apr 23 16:56:45 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resource.name
     *
     * @param name the value for resource.name
     *
     * @mbg.generated Mon Apr 23 16:56:45 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resource.url
     *
     * @return the value of resource.url
     *
     * @mbg.generated Mon Apr 23 16:56:45 CST 2018
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resource.url
     *
     * @param url the value for resource.url
     *
     * @mbg.generated Mon Apr 23 16:56:45 CST 2018
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resource.open_mode
     *
     * @return the value of resource.open_mode
     *
     * @mbg.generated Mon Apr 23 16:56:45 CST 2018
     */
    public String getOpenMode() {
        return openMode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resource.open_mode
     *
     * @param openMode the value for resource.open_mode
     *
     * @mbg.generated Mon Apr 23 16:56:45 CST 2018
     */
    public void setOpenMode(String openMode) {
        this.openMode = openMode == null ? null : openMode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resource.description
     *
     * @return the value of resource.description
     *
     * @mbg.generated Mon Apr 23 16:56:45 CST 2018
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resource.description
     *
     * @param description the value for resource.description
     *
     * @mbg.generated Mon Apr 23 16:56:45 CST 2018
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resource.icon
     *
     * @return the value of resource.icon
     *
     * @mbg.generated Mon Apr 23 16:56:45 CST 2018
     */
    public String getIcon() {
        return icon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resource.icon
     *
     * @param icon the value for resource.icon
     *
     * @mbg.generated Mon Apr 23 16:56:45 CST 2018
     */
    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resource.pid
     *
     * @return the value of resource.pid
     *
     * @mbg.generated Mon Apr 23 16:56:45 CST 2018
     */
    public Long getPid() {
        return pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resource.pid
     *
     * @param pid the value for resource.pid
     *
     * @mbg.generated Mon Apr 23 16:56:45 CST 2018
     */
    public void setPid(Long pid) {
        this.pid = pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resource.seq
     *
     * @return the value of resource.seq
     *
     * @mbg.generated Mon Apr 23 16:56:45 CST 2018
     */
    public Byte getSeq() {
        return seq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resource.seq
     *
     * @param seq the value for resource.seq
     *
     * @mbg.generated Mon Apr 23 16:56:45 CST 2018
     */
    public void setSeq(Byte seq) {
        this.seq = seq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resource.status
     *
     * @return the value of resource.status
     *
     * @mbg.generated Mon Apr 23 16:56:45 CST 2018
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resource.status
     *
     * @param status the value for resource.status
     *
     * @mbg.generated Mon Apr 23 16:56:45 CST 2018
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resource.opened
     *
     * @return the value of resource.opened
     *
     * @mbg.generated Mon Apr 23 16:56:45 CST 2018
     */
    public Byte getOpened() {
        return opened;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resource.opened
     *
     * @param opened the value for resource.opened
     *
     * @mbg.generated Mon Apr 23 16:56:45 CST 2018
     */
    public void setOpened(Byte opened) {
        this.opened = opened;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resource.resource_type
     *
     * @return the value of resource.resource_type
     *
     * @mbg.generated Mon Apr 23 16:56:45 CST 2018
     */
    public Byte getResourceType() {
        return resourceType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resource.resource_type
     *
     * @param resourceType the value for resource.resource_type
     *
     * @mbg.generated Mon Apr 23 16:56:45 CST 2018
     */
    public void setResourceType(Byte resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resource.create_time
     *
     * @return the value of resource.create_time
     *
     * @mbg.generated Mon Apr 23 16:56:45 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resource.create_time
     *
     * @param createTime the value for resource.create_time
     *
     * @mbg.generated Mon Apr 23 16:56:45 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}