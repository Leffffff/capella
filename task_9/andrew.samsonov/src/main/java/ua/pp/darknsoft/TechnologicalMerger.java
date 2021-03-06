package ua.pp.darknsoft;

public class TechnologicalMerger {

  public static int[] merge(int[] array1, int[] array2) {
    if (array1 == null && array2 == null) {
      return new int[0];
    }
    if (array1 == null) {
      if (array2.length > 1) {
        return sort(array2);
      } else {
        return array2;
      }
    }
    if (array2 == null) {
      if (array1.length > 1) {
        return sort(array1);
      } else {
        return array1;
      }
    }
    if (array1.length == 0) {
      return sort(array2);
    }
    if (array2.length == 0) {
      return sort(array1);
    }

    int[] combinedIntArray = new int[array1.length + array2.length];
    for (int i = 0; i < array1.length; i++) {
      combinedIntArray[i] = array1[i];
    }
    for (int i = 0; i < array2.length; i++) {
      combinedIntArray[array1.length + i] = array2[i];
    }
    return sort(combinedIntArray);
  }

  private static int[] sort(int[] array) {
    int leftBorder = 0;
    int rightBorder = array.length - 1;
    int temp = 0;
    while (leftBorder < rightBorder) {
      for (int i = leftBorder; i < rightBorder; i++) {
        if (array[i] > array[i + 1]) {
          temp = array[i];
          array[i] = array[i + 1];
          array[i + 1] = temp;
        }
      }
      rightBorder--;
      for (int i = rightBorder; i > leftBorder; i--) {
        if (array[i] < array[i - 1]) {
          temp = array[i];
          array[i] = array[i - 1];
          array[i - 1] = temp;
        }
      }
      leftBorder++;
    }
    return array;
  }

}
