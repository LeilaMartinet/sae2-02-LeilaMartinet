#include <stdio.h>
#include <stdlib.h>
#include <string.h>

char* erase(const char* chaine) {
  int i = 0;
  int compteur = 1;
  int j = 0;
  unsigned int len=0;
  while(*(chaine+len)) len++;
  char* chaine_erased = (char*) malloc(len);
    while(chaine[i] != '\0') {
      if(chaine[i] == ' ') {
        compteur = 1;
        while(chaine[i+compteur] != '\0' && chaine[i+compteur] == ' ') {
          chaine_erased[i-j+compteur] = ' ';
          compteur++;
        }
        if(compteur == 1) {
          j++;
        }else {
          chaine_erased[i-j] = ' ';
          i+=compteur-1;
        }
      }else {
          chaine_erased[i-j] = chaine[i];
      }
      i++;
    }
  return chaine_erased;
}

int main (void) {
  if (strcmp(erase("666 , the number of the beast"), "666,thenumberofthebeast") == 0) {
    printf ("Ok test 1\n");
  }
  if (strcmp(erase("06  07 65 19 70 "), "06  07651970") == 0) {
    printf ("Ok test 2\n");
  }
  if (strcmp(erase("OK"), "OK") == 0) {
    printf ("Ok test 3\n");
  }
  if (strcmp(erase(" Cou cou  J M  B"), "Coucou  JM  B") == 0) {
    printf ("Ok test 4\n");
  }
  if (strcmp(erase(""), "") == 0) {
    printf ("Ok test 5\n");
  }
  if (strcmp(erase(" "), "") == 0) {
    printf ("Ok test 6\n");
  }
  if (strcmp(erase("  "), "  ") == 0) {
    printf ("Ok test 7\n");
  }
  if (strcmp(erase("   "), "   ") == 0) {
    printf ("Ok test 8\n");
  }
  if (strcmp(erase("    "), "    ") == 0) {
    printf ("Ok test 9\n");
  }
  if (strcmp(erase("   f "), "   f") == 0) {
    printf ("Ok test 10\n");
  }
  if (strcmp(erase(" a"), "a") == 0) {
    printf ("Ok test 11\n");
  }
  if (strcmp(erase("       "), "       ") == 0) {
    printf ("Ok test 12\n");
  }
  printf("%s", erase (" "));
  
}