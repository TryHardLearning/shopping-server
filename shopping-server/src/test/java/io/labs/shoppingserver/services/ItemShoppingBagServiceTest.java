package io.labs.shoppingserver.services;

import io.labs.shoppingserver.models.ItemShoppingBag;
import io.labs.shoppingserver.models.Product;
import io.labs.shoppingserver.repositories.ItemShoppingBagRepository;
import io.labs.shoppingserver.services.ItemShoppingBagService;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class ItemShoppingBagServiceTest {
/*
    ItemShoppingBagRepository mockRepository = mock(ItemShoppingBagRepository.class);

    ItemShoppingBagService service = new ItemShoppingBagService(mockRepository);

    @BeforeAll
    public static void setup() {

        Product product = Product.builder().name("GummyBear").description("Gummy").cost(25.5).build();

        ItemShoppingBag itemOne = ItemShoppingBag.builder().product(product).quantity(1).cost(25.5).build();
        ItemShoppingBag itemTwo = ItemShoppingBag.builder().product(product).quantity(1).cost(25.5).build();

    }
    @AfterAll
    public static void tearDown() {

    }
        // can retrieve all items in shopping bag
        @Test
        public void test_retrieve_all_items() {

            List<ItemShoppingBag> expectedItems = new ArrayList<>();
            expectedItems.add(new ItemShoppingBag(1L, new Product(), 1, 10.0));
            expectedItems.add(new ItemShoppingBag(2L, new Product(), 2, 20.0));

            when(mockRepository.findAll()).thenReturn(expectedItems);


            List<ItemShoppingBag> actualItems = service.findAll();

            assertEquals(expectedItems, actualItems);
        }

        // can handle empty shopping bag when retrieving all items
        @Test
        public void test_retrieve_all_items_empty_bag() {
            ItemShoppingBagRepository mockRepository = mock(ItemShoppingBagRepository.class);
            List<ItemShoppingBag> expectedItems = new ArrayList<>();
            when(mockRepository.findAll()).thenReturn(expectedItems);

            ItemShoppingBagService itemShoppingBagService = new ItemShoppingBagService(mockRepository);
            List<ItemShoppingBag> actualItems = itemShoppingBagService.findAll();

            assertEquals(expectedItems, actualItems);
        }

        // can save an item to the shopping bag
        @Test
        public void test_saveItemToShoppingBag() {
            // Create a new item

            var item  = new ItemShoppingBag();
            item.setProduct(new Product());
            item.setQuantity(1);
            item.setCost(10.0);

            // Save the item to the shopping bag
            ItemShoppingBag savedItem = service.save(item);

            // Check if the item is saved successfully
            assertNotNull(savedItem.getId());
            assertEquals(item.getProduct(), savedItem.getProduct());
            assertEquals(item.getQuantity(), savedItem.getQuantity());
            assertEquals(item.getCost(), savedItem.getCost());
        }

        // can save and flush an item to the shopping bag
        @Test
        public void test_save_and_flush_item() {
            // Create a new item
            ItemShoppingBag item = new ItemShoppingBag();
            item.setProduct(new Product());
            item.setQuantity(1);
            item.setCost(10.0);

            // Save and flush the item
            ItemShoppingBag savedItem = service.saveAndFlush(item);

            // Check if the item is saved and flushed successfully
            assertNotNull(savedItem);
            assertNotNull(savedItem.getId());
            assertEquals(item.getProduct(), savedItem.getProduct());
            assertEquals(item.getQuantity(), savedItem.getQuantity());
            assertEquals(item.getCost(), savedItem.getCost());
        }

        // can save multiple items to the shopping bag
        @Test
        public void test_save_multiple_items_to_shopping_bag() {
            // Create a list of ItemShoppingBag objects
            List<ItemShoppingBag> items = new ArrayList<>();
            ItemShoppingBag item1 = new ItemShoppingBag();
            item1.setProduct(new Product());
            item1.setQuantity(2);
            item1.setCost(10.0);
            items.add(item1);

            ItemShoppingBag item2 = new ItemShoppingBag();
            item2.setProduct(new Product());
            item2.setQuantity(3);
            item2.setCost(15.0);
            items.add(item2);

            // Save the items to the shopping bag
            List<ItemShoppingBag> savedItems = (List<ItemShoppingBag>) service.save(items);

            // Assert that the items were saved successfully
            assertEquals(items.size(), savedItems.size());
            assertTrue(savedItems.contains(item1));
            assertTrue(savedItems.contains(item2));
        }
        */
    /*
        // can find an item in the shopping bag by ID
        @Test
        public void test_findItemById() {
            // Create a mock ItemShoppingBag object
            ItemShoppingBag item = new ItemShoppingBag();
            item.setId(1L);
            item.setProduct(new Product());
            item.setQuantity(2);
            item.setCost(10.0);

            // Mock the repository's findById method to return the mock ItemShoppingBag object
            when(repository.findById(1L)).thenReturn(Optional.of(item));

            // Create an instance of ItemShoppingBagService
            ItemShoppingBagService service = new ItemShoppingBagService(repository);

            // Call the findById method of the service
            ItemShoppingBag result = service.findById(1L);

            // Assert that the result is equal to the mock ItemShoppingBag object
            assertEquals(item, result);
        }

        // can count the number of items in the shopping bag
        @Test
        public void test_countItemsInShoppingBag() {
            // Create a mock list of items in the shopping bag
            List<ItemShoppingBag> items = new ArrayList<>();
            items.add(new ItemShoppingBag(1L, new Product(), 2, 10.0));
            items.add(new ItemShoppingBag(2L, new Product(), 3, 15.0));
            items.add(new ItemShoppingBag(3L, new Product(), 1, 5.0));

            // Mock the repository to return the mock list of items
            ItemShoppingBagRepository mockRepository = Mockito.mock(ItemShoppingBagRepository.class);
            Mockito.when(mockRepository.findAll()).thenReturn(items);

            // Create an instance of ItemShoppingBagService with the mock repository
            ItemShoppingBagService itemShoppingBagService = new ItemShoppingBagService(mockRepository);

            // Call the count method on the service
            long count = itemShoppingBagService.count();

            // Assert that the count is equal to the size of the mock list
            assertEquals(items.size(), count);
        }

        // can delete an item from the shopping bag by ID
        @Test
        public void test_deleteItemById() {
            // Create a mock item
            ItemShoppingBag item = new ItemShoppingBag();
            item.setId(1L);
            item.setProduct(new Product());
            item.setQuantity(1);
            item.setCost(10.0);

            // Save the item
            ItemShoppingBag savedItem = service.save(item);

            // Delete the item by ID
            service.delete(savedItem.getId());

            // Check if the item is deleted
            assertNull(service.findById(savedItem.getId()));
        }
        */
    }

