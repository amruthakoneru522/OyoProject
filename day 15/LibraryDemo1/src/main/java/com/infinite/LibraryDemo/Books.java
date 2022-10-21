package com.infinite.LibraryDemo;

public class Books {
	private int id;
	private String name;
	private String author;
	private String editor;
	private String dept;
	private int noOfBooks;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getEditor() {
		return editor;
	}
	public void setEditor(String editor) {
		this.editor = editor;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getNoOfBooks() {
		return noOfBooks;
	}
	public void setNoOfBooks(int noOfBooks) {
		this.noOfBooks = noOfBooks;
	}
	public Books(int id, String name, String author, String editor, String dept, int noOfBooks) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.editor = editor;
		this.dept = dept;
		this.noOfBooks = noOfBooks;
	}
	@Override
	public String toString() {
		return "Books [id=" + id + ", name=" + name + ", author=" + author + ", editor=" + editor + ", dept=" + dept
				+ ", noOfBooks=" + noOfBooks + "]";
	}
	

}
