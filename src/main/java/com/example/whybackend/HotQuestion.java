package com.example.whybackend;

public class HotQuestion {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hot_question.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hot_question.order
     *
     * @mbg.generated
     */
    private String order;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hot_question.rise
     *
     * @mbg.generated
     */
    private String rise;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hot_question.title
     *
     * @mbg.generated
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hot_question.image_url
     *
     * @mbg.generated
     */
    private String imageUrl;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hot_question.id
     *
     * @return the value of hot_question.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hot_question.id
     *
     * @param id the value for hot_question.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hot_question.order
     *
     * @return the value of hot_question.order
     *
     * @mbg.generated
     */
    public String getOrder() {
        return order;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hot_question.order
     *
     * @param order the value for hot_question.order
     *
     * @mbg.generated
     */
    public void setOrder(String order) {
        this.order = order == null ? null : order.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hot_question.rise
     *
     * @return the value of hot_question.rise
     *
     * @mbg.generated
     */
    public String getRise() {
        return rise;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hot_question.rise
     *
     * @param rise the value for hot_question.rise
     *
     * @mbg.generated
     */
    public void setRise(String rise) {
        this.rise = rise == null ? null : rise.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hot_question.title
     *
     * @return the value of hot_question.title
     *
     * @mbg.generated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hot_question.title
     *
     * @param title the value for hot_question.title
     *
     * @mbg.generated
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hot_question.image_url
     *
     * @return the value of hot_question.image_url
     *
     * @mbg.generated
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hot_question.image_url
     *
     * @param imageUrl the value for hot_question.image_url
     *
     * @mbg.generated
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl == null ? null : imageUrl.trim();
    }
}