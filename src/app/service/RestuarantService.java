package app.service;

import app.model.*;

import java.util.ArrayList;
import java.util.List;

public class RestuarantService {
        public Restuarant addRestaurants(){


                Dishes dishes=new Dishes();



            List<Starter>items =new ArrayList<>();
                Starter starter=new Starter();
                Starter starter2=new Starter();
                starter.name="ChickenLolliPop";
                starter.prize=150;
                starter2.name="Wings";
                starter2.prize=150;
               items .add(starter);
                items.add(starter2);


                List<MainCourse>mainCourseList=new ArrayList<>();
                MainCourse mainCourse=new MainCourse();
                MainCourse mainCourse2=new MainCourse();
                mainCourse.name="Chicken Birayani";
                mainCourse.prize=350;
                mainCourse2.name="Mutton Birayani";
                mainCourse2.prize=450;
                mainCourseList.add(mainCourse);
                mainCourseList.add(mainCourse2);

                Desert desert=new Desert();
                desert.name="GulabJam";
                desert.prize=70;
                Desert desert1=new Desert();
                desert1.name="Browne";
                desert1.prize=110;
                List<Desert>desertList=new ArrayList<>();
                desertList.add(desert);
                desertList.add(desert1);


                dishes.mainCourses=mainCourseList;
                dishes.deserts=desertList;
                dishes.items=items;


                Restuarant restuarant=new Restuarant();
                Address address=new Address();
                address.area="Jntu";
                address.street="Jntu MainRoad";
                address.pincode=500252;
                address.flatNo="3-24";
                restuarant.name="Mehifill";
                restuarant.address=address;
                restuarant.dishes= (List<Dishes>) dishes;
             return restuarant;


        }

}
