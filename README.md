# __JP Project__
#### By:  Gage Kettering

## Description of JP Project
This is a work in progress, I am working on this project throughout the semester and will complete steps throughout each week. The goal of 
this project is to design a template in Java for creating and recording all future production item. When the project is finished, it will
create a flexible structure that could be used in any production line. This structure would then allow easy modification to handle 
different products.

## Classes with Descriptions
* __Class: Main__ - Main class that allows the program to run
* __Class: Widget extends class Product__ -  A subclass of the Product class, the widget class will name the different products. Starting with widget 1 and increasing
* __Abstract Class: Product implements interface Item__ - Will implement the basic functionality that all items on a production line should have
* __Interface: Item__ - Contains constant methods that every "Item" would need to contain
* __Enum: ItemType__ - Contains the constants that represent the different types of items available for production
* __Class: AudioPlayer extends class Product and implements interface MultimediaControl__ - contains everthing that a media player will do functionally
* __Interface: MultimediaControl__ - contains the methods that every multimedia device will need to function

## Resources 
CaveOfProgramming | doc.oracle.com  | Professor Vanselow
