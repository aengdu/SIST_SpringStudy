package com.sist.mapper;
import java.util.*;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.sist.vo.*;
public interface FoodMapper {
   @Select("SELECT cno,title,poster "
		  +"FROM project_category ORDER BY cno ASC")
   public List<CategoryVO> categoryListData();
   
   @Select("SELECT title,subject FROM project_category "
		  +"WHERE cno=#{cno}")
   public CategoryVO categoyInfoData(int cno);
   
   @Select("SELECT fno,name,poster,score,tel,address,type "
		  +"FROM project_food "
		  +"WHERE cno=#{cno}")
   public List<FoodVO> foodListData(int cno);
   
   @Update("UPDATE project_food SET "
		  +"hit=hit+1 "
		  +"WHERE fno=#{fno}")
   public void foodHitIncrement(int fno);
   
   @Select("SELECT * FROM project_food "
		  +"WHERE fno=#{fno}")
   public FoodVO foodDetailData(int fno);
   
   @Select("select fno, name, poster, score, num "
		   +"from (select fno, name, poster, score, rownum as num "
		   +"from(select fno, name, poster, score "
		   +"from food_location "
		   +"where address like '%'||#{address||'%' order by fno asc)) "
		   +"where num between #{start} and #{end}")
   public List<FoodVO> foodLocationFindData(Map map);
   
   @Select("select * from location "
		   +"where fno=#{fno}")
   public FoodVO foodLocationDetailData(int fno);
   
   @Select("select ceil(count(*)/20.0) "
		   +"from food_location "
		   +"where address like '%'||#{address}||'%'")
   public int foodFindTotalPage(String address);
}
