package ee.valiit.wishlistapi.util;

import ee.valiit.wishlistapi.dto.DateDto;
import ee.valiit.wishlistapi.model.Date;

public class Transformer {

    public static Date toDateModel(DateDto initialObject) {
        Date resultingObject = new Date();
        resultingObject.setId(initialObject.getId());
        resultingObject.setName(initialObject.getName());
        resultingObject.setDate(initialObject.getDate());
        resultingObject.setUserId(initialObject.getUserId());

        return resultingObject;
    }

    public static DateDto toDateDto(Date initialObject){
        if (initialObject == null) {
            return null;
        }

        DateDto resultingObject = new DateDto();
        resultingObject.setId(initialObject.getId());
        resultingObject.setName(initialObject.getName());
        resultingObject.setDate(initialObject.getDate());
        resultingObject.setUserId(initialObject.getUserId());

        return resultingObject;
    }
}
