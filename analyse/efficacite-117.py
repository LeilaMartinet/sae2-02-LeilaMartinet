import enum

#Pas de correction apportée

# return string without single spaces

def erase(cc):

    # list with index of the spaces
    listIndex = []
    
    # list of the sentence, convert the sentence into a list
    listSentence = []
    listSentence[:0]=cc
    
    # find the spaces in the sentence, then append his index to listIndex
    for index, c in enumerate(cc):
        if ord(c) == 32:
            listIndex.append(index)
    
    # count for the next loop below
    cpt = 0
    
    # look into listIndex
    for i in listIndex:
        # verify if i equals 0 then check in the sentence if the index after i is a space or not then then remove the caracter from listSentence
        if i == 0:
            if ord(cc[i]) != ord(cc[i+1]):
                listSentence.pop(i-cpt)
                
                #add the count +1 since the size of listSetence decreased by 1 caracter
                cpt+= 1
                
        # verify if i equals the last index of the sentence then check in the sentence if the index before i is a space or not then remove the caracter from listSentence
        elif i == (len(cc)-1):
            if ord(cc[i]) != ord(cc[i-1]):
                listSentence.pop(i-cpt)
                
                #add the count +1 since the size of listSetence decreased by 1 caracter
                cpt+= 1
                
        # verify in the sentence if the index before & after i are spaces or not then remove the caracter from listSentence
        elif (ord(cc[i]) != ord(cc[i+1])) & (ord(cc[i]) != ord(cc[i-1])):
                listSentence.pop(i-cpt)
                
                #add the count +1 since the size of listSetence decreased by 1 caracter
                cpt+= 1
                
    # convert listSentence into a String
    sentence = ''.join(map(str,listSentence))
    
    return sentence