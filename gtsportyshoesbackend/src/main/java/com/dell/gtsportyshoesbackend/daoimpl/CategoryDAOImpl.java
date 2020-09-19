package com.dell.gtsportyshoesbackend.daoimpl;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.dell.gtsportyshoesbackend.dao.CategoryDAO;
import com.dell.gtsportyshoesbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<>();
			static {
		Category category= new Category();
		//Adding in first category
		category.setId(1);
		category.setName("Women");
		category.setDescription("Women's shoes");
		category.setImageURL("Shoe_w1.png");
		
		categories.add(category);
		
		category= new Category();
		//Adding in second category
		category.setId(2);
		category.setName("Men");
		category.setDescription("Men's shoes");
		category.setImageURL("Shoe_m1.png");
		
		categories.add(category);
		
		category= new Category();
		//Adding in third category
		category.setId(3);
		category.setName("Kids");
		category.setDescription("Kid's shoes");
		category.setImageURL("Shoe_k1.png");
		
		categories.add(category);
	}
	
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

}
