package com.serafeim.agia.zoni.agiazoni.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Article implements Serializable {

    public String date;
    public String status;
    public String title;
    public String content;
    public String excerpt;
    public Integer featured_media;
    public String comment_status;
    public String ping_status;
    public String sticky;
    public String format;
    public String meta;
    public Set<Integer> categories = new HashSet<>();
    public Set<Integer> tags = new HashSet<>();
    public String template;
    // those 4 fields are for the posts
    public String ennoima;
    public Set<Integer> article_authors = new HashSet<>();
    public Set<Integer> sources = new HashSet<>();
    public String numReadings;

    public Article() {
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getExcerpt() {
        return this.excerpt;
    }

    public void setExcerpt(String excerpt) {
        this.excerpt = excerpt;
    }

    public Integer getFeatured_media() {
        return this.featured_media;
    }

    public void setFeatured_media(Integer featured_media) {
        this.featured_media = featured_media;
    }

    public String getComment_status() {
        return this.comment_status;
    }

    public void setComment_status(String comment_status) {
        this.comment_status = comment_status;
    }

    public String getPing_status() {
        return this.ping_status;
    }

    public void setPing_status(String ping_status) {
        this.ping_status = ping_status;
    }

    public String getSticky() {
        return this.sticky;
    }

    public void setSticky(String sticky) {
        this.sticky = sticky;
    }

    public String getFormat() {
        return this.format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getMeta() {
        return this.meta;
    }

    public void setMeta(String meta) {
        this.meta = meta;
    }

    public Set<Integer> getCategories() {
        return this.categories;
    }

    public void setCategories(Set<Integer> categories) {
        this.categories = categories;
    }

    public Set<Integer> getTags() {
        return this.tags;
    }

    public void setTags(Set<Integer> tags) {
        this.tags = tags;
    }

    public Set<Integer> getArticle_authors() {
        return this.article_authors;
    }

    public void setArticle_authors(Set<Integer> article_authors) {
        this.article_authors = article_authors;
    }

    public String getEnnoima() {
        return this.ennoima;
    }

    public void setEnnoima(String ennoima) {
        this.ennoima = ennoima;
    }

    public Set<Integer> getSources() {
        return this.sources;
    }

    public void setSources(Set<Integer> sources) {
        this.sources = sources;
    }

    public String getNumReadings() {
        return numReadings;
    }

    public void setNumReadings(String numReadings) {
        this.numReadings = numReadings;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }
}
