package Repo;

import Entity.Category;

import java.util.ArrayList;

public class CategoriesRepo {
    public void insertCategory(Category category){};
    public void updateCategory(Category category){};
    public void deleteCategory(Category category){};
    public Category selectCategory(Integer id){
        throw new UnsupportedOperationException();
    };
    public ArrayList<Category> selectAllCategories(){
        throw new UnsupportedOperationException();
    };

}
