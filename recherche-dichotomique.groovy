result
    si (position <> -1 ) alors
        ecrire('index de entier',x,' est :',position)
    Sinon
        ecrire(' entier',x,'n exist past dans le tableau')  
    fin si 
    
    position = rechercheDichotomique(T,n,x)
   
    ecrire('entier recherche')
    lire(x)

    pour i de 1 a n faire
        si i = 1 alors
            ecrire('T[',i,']')
            lire(T[i])
        sinon    
            repeat
                ecrire('T[',i,']')
                lire(T[i])
            jusqua(T[i-1] < t[i])
        fin si    
    fin pour
    

    repeter
        ecrire('donner la taille de tableau')
        lire(n)
    jusqua(( n < 100) et (n>0))

fin program

Fonction rechercheDichotomique(T,n,x) :entier
    début ← 1
    fin ← n
    result ← -1

Répéter
        milieu ← (debut + fin) div 2

        Si T[milieu] = x alors
            result ← milieu
        Sinon si T[milieu] < x alors
            debut ← milieu + 1
        Sinon
            fin ← milieu - 1
Jusqu'à (debut > fin) OU (result <> -1)

    RechercheDichotomique = result
Fin Fonction



T D O
nom     type    role 

n       entier   taille de tableau
i       entier     compteur
T       arr        tableau contient des entier
x      entier      entier a recharcher
position entier    position d'entier dans le tableau 


type  

arr : tableau [1 ..100 ] d'entier



---------------------------------------------------
n =  6 
    pour i de 1 a n faire //     pour i de 1 a  6 faire
i = 1: 
       si 1 = 1 alors // vrai
            ecrire('T[',i,']') // t[1]  
            lire(T[i])          // 5 
i = 2             
         si 2 = 1  alors // faux
           sinon    
            repeat
                ecrire('T[',i,']')      // t[2]
                lire(T[i])              // 6
            jusqua(T[i-1] < t[i])       // (T[2-1] < T[2]) -> T[1] < T[2] ->5 < 6  // vrai
i 




