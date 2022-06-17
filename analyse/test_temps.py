import time

def erase(cc):
    pass

#La première exécution prend souvent plus de temps, donc je l'exécute à blanc
erase ("")

fichier = open ('C:\\Users\\Leila\\Desktop\\Rendu\\Test\\texte10.txt')
t1 = time.perf_counter()
erase (str(fichier))
t2 = time.perf_counter()
print ("10 comparaisons", t2-t1, "s")

fichier = open ('C:\\Users\\Leila\\Desktop\\Rendu\\Test\\texte50.txt')
t1 = time.perf_counter()
erase (str(fichier))
t2 = time.perf_counter()
print ("50 comparaisons", t2-t1, "s")

fichier = open ('C:\\Users\\Leila\\Desktop\\Rendu\\Test\\texte100.txt')
t1 = time.perf_counter()
erase (str(fichier))
t2 = time.perf_counter()
print ("100 comparaisons", t2-t1, "s")

fichier = open ('C:\\Users\\Leila\\Desktop\\Rendu\\Test\\texte500.txt')
t1 = time.perf_counter()
erase (str(fichier))
t2 = time.perf_counter()
print ("500 comparaisons", t2-t1, "s")

fichier = open ('C:\\Users\\Leila\\Desktop\\Rendu\\Test\\texte1000.txt')
t1 = time.perf_counter()
erase (str(fichier))
t2 = time.perf_counter()
print ("1000 comparaisons", t2-t1, "s")

fichier = open ('C:\\Users\\Leila\\Desktop\\Rendu\\Test\\texte100000.txt')
t1 = time.perf_counter()
erase (str(fichier))
t2 = time.perf_counter()
print ("100000 comparaisons", t2-t1, "s")

fichier = open ('C:\\Users\\Leila\\Desktop\\Rendu\\Test\\texte1000000.txt')
t1 = time.perf_counter()
erase (str(fichier))
t2 = time.perf_counter()
print ("1000000 comparaisons", t2-t1, "s")