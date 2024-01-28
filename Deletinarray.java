#include <stdio.h>
int main() {
    int array[10] = {1, 2, 3, 4, 5};
    int size = 5;

    // Position from which the element should be deleted
    //statically define the position value
    int position = 2;
    printf("array before deletion:\n");
    for (int i = 0; i < size; ++i) {
        printf("%d ", array[i]);
    }
    
    if (position < 0 || position >= size) {
        printf("Invalid position for deletion.\n");
       
    }

    // Shift elements to
for (int i = position; i < size - 1; ++i) {
        array[i] = array[i + 1];
    }

    // Update the size of the array
    size--;
    printf("\nUpdated array after deletion:\n");
    for (int i = 0; i < size; ++i) {
        printf("%d ", array[i]);
    }

    return 0;
}
