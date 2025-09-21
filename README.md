# SDP Assignment 2 — Fruits: Factory Method & Abstract Factory

## Overview
Java demo of two GoF patterns on a simple domain (fruits).

## Run
VS Code → open folder → run:
- `factorymethod/MainFactoryMethodDemo.java`
- `abstractfactory/MainAbstractFactoryDemo.java`
Requires: JDK 17+.

## Structure
- `fruit/` — `Fruit`, `SweetFruit`, `CitrusFruit`, concrete: `Apple`, `Banana`, `Orange`, `Lemon`
- `factorymethod/` — `FruitFactory` (Creator), `*Factory` (Concrete Creators), `FactoryMethodClient`, `MainFactoryMethodDemo`
- `abstractfactory/` — `FruitFamilyFactory` (AF), `TropicalFruitFactory`, `TemperateFruitFactory`, `AbstractFactoryClient`, `MainAbstractFactoryDemo`

## Clean Code
- Small, single-purpose methods; clear names.
- Separation of concerns: creation in factories, usage in clients.
- Open/Closed: add products/families w/o changing clients.

## Example output
