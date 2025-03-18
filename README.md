# Big Diwali Sale: BOGO Offer

## Overview

The **Big Diwali Sale: BOGO Offer** is a campaign where customers can take advantage of the "Buy One Get One Free" (BOGO) deal. For every product a customer buys, they can receive another product for free, provided the free product is of equal or lesser value than the one purchased.

This project contains a Java implementation that calculates the maximum discount a customer can receive by pairing products in the most efficient way possible. The goal is to maximize savings by pairing the most expensive products with others eligible for the free offer.

---

## Features

- **BOGO Logic**: Implements the "Buy One, Get One Free" logic.
- **Maximized Discount**: Automatically pairs the most expensive items to get the highest possible discount.
- **Java Implementation**: Written in Java, using basic collections to manage product prices and apply the BOGO rules.

---

## Problem Explanation

### Offer Rules:

1. **Customers can buy any number of products.**
2. **When a customer buys one product, they can get another product for free.**
3. **The free product must be of equal or lesser value than the one purchased.**

### Goal:
- Pair items in such a way that customers pay for the highest priced products and get the next highest products for free.

---

## Example Scenarios

### Example 1:

**Input:**
- Product Price List: `[10, 20, 30, 40, 50, 60]`

**Output:**
- Discounted Items (Free): `[50, 30, 10]`
- Payable Items: `[60, 40, 20]`

**Explanation:**
- **Pair the highest price items with the next highest eligible for free:**
  - Buy 60, get 50 free
  - Buy 40, get 30 free
  - Buy 20, get 10 free

---

### Example 2:

**Input:**
- Product Price List: `[110, 20, 30, 40, 50, 50, 60]`

**Output:**
- Discounted Items (Free): `[50, 40, 20]`
- Payable Items: `[110, 50, 30, 60]`

**Explanation:**
- **Pair the highest price items with the next highest eligible for free:**
  - Buy 110, get 50 free
  - Buy 60, get 40 free
  - Buy 50, get 20 free
  - Buy 30 (no eligible free item left, hence just pay for it)

---

## Solution Strategy

### How to Maximize the Discount:

1. **Sort the Product Prices in Descending Order:**
   - Sorting ensures we start by pairing the most expensive items 
