import org.junit.jupiter.api.Test;
import personalizedmealplangenerator.HighProteinMeal;
import personalizedmealplangenerator.Meal;
import personalizedmealplangenerator.VeganMeal;
import personalizedmealplangenerator.VegetarianMeal;

import static org.junit.jupiter.api.Assertions.*;

class MealPlanGeneratorTest {
    @Test
    void testVegetarianMealDetails() {
        Meal<VegetarianMeal> meal = Meal.generateMealPlan(new VegetarianMeal());
        assertEquals("Vegetarian Meal:  vegetables, bread, and chapati.", meal.getMealDetails());
    }

    @Test
    void testVeganMealDetails() {
        Meal<VeganMeal> meal = Meal.generateMealPlan(new VeganMeal());
        assertEquals("Vegan Meal:  soup,  salad, and brown bread.", meal.getMealDetails());
    }



    @Test
    void testHighProteinMealDetails() {
        Meal<HighProteinMeal> meal = Meal.generateMealPlan(new HighProteinMeal());
        assertEquals("High Protein Meal:  eggs, chicken , and  cheese.", meal.getMealDetails());
    }

    @Test
    void testInvalidMealPlan() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Meal.generateMealPlan(null);
        });
        assertEquals("Invalid Meal Plan", exception.getMessage());
    }
}