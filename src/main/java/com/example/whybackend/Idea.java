package com.example.whybackend;

public class Idea {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column idea.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column idea.context
     *
     * @mbg.generated
     */
    private String context;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column idea.image_url
     *
     * @mbg.generated
     */
    private String imageUrl;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column idea.id
     *
     * @return the value of idea.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column idea.id
     *
     * @param id the value for idea.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column idea.context
     *
     * @return the value of idea.context
     *
     * @mbg.generated
     */
    public String getContext() {
        return context;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column idea.context
     *
     * @param context the value for idea.context
     *
     * @mbg.generated
     */
    public void setContext(String context) {
        this.context = context == null ? null : context.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column idea.image_url
     *
     * @return the value of idea.image_url
     *
     * @mbg.generated
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column idea.image_url
     *
     * @param imageUrl the value for idea.image_url
     *
     * @mbg.generated
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl == null ? null : imageUrl.trim();
    }
}