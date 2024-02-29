package org.example;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static Integer sumAllElems(List<Integer> listElem){
        if (listElem.isEmpty()){
            return 0;
        }
        else {
            return listElem.get(0) + sumAllElems(listElem.subList(1,listElem.size()));
        }
    }

    public static Double mittelWertBerechnung(List<Integer> list){
        if (list.isEmpty()) {
            return Double.NaN;
        } else if (list.size() == 1) {
            return (double) list.get(0);
        } else {
            return ((double) list.get(0) + (list.size() - 1) * mittelWertBerechnung(list.subList(1, list.size()))) / list.size();
        }
    }

    public static List<String> sortiereAlphabetischRekursiv(List<String> liste) {
        if (liste.size() <= 1) {
            return new ArrayList<>(liste);
        } else {
            int mitte = liste.size() / 2;
            List<String> linkeHälfte = sortiereAlphabetischRekursiv(liste.subList(0, mitte));
            List<String> rechteHälfte = sortiereAlphabetischRekursiv(liste.subList(mitte, liste.size()));
            return merge(linkeHälfte, rechteHälfte);
        }
    }
        public static List<String> merge(List<String> linkeListe, List<String> rechteListe) {
            List<String> gemischteListe = new ArrayList<>();
            int i = 0, j = 0;
            while (i < linkeListe.size() && j < rechteListe.size()) {
                if (linkeListe.get(i).compareTo(rechteListe.get(j)) < 0) {
                    gemischteListe.add(linkeListe.get(i));
                    i++;
                } else {
                    gemischteListe.add(rechteListe.get(j));
                    j++;
                }
            }
            while (i < linkeListe.size()) {
                gemischteListe.add(linkeListe.get(i));
                i++;
            }
            while (j < rechteListe.size()) {
                gemischteListe.add(rechteListe.get(j));
                j++;
            }
            return gemischteListe;
        }

    public static List<Objekt> sortiereListe(List<Objekt> liste) {
        if (liste.size() <= 1) {
            return new ArrayList<>(liste);
        }

        int mitte = liste.size() / 2;
        List<Objekt> linkeHaelfte = sortiereListe(liste.subList(0, mitte));
        List<Objekt> rechteHaelfte = sortiereListe(liste.subList(mitte, liste.size()));

        return mergeObjektList(linkeHaelfte, rechteHaelfte);
    }

    private static List<Objekt> mergeObjektList(List<Objekt> linkeListe, List<Objekt> rechteListe) {
        List<Objekt> gemischteListe = new ArrayList<>();
        int i = 0, j = 0;

        while (i < linkeListe.size() && j < rechteListe.size()) {
            Objekt o1 = linkeListe.get(i);
            Objekt o2 = rechteListe.get(j);

            if (o1.getDatum().compareTo(o2.getDatum()) < 0) {
                gemischteListe.add(o1);
                i++;
            } else if (o1.getDatum().compareTo(o2.getDatum()) > 0) {
                gemischteListe.add(o2);
                j++;
            } else {
                if (o1.getPrioritaet() < o2.getPrioritaet()) {
                    gemischteListe.add(o1);
                    i++;
                } else if (o1.getPrioritaet() > o2.getPrioritaet()) {
                    gemischteListe.add(o2);
                    j++;
                } else {
                    if (o1.getTitel().compareTo(o2.getTitel()) < 0) {
                        gemischteListe.add(o1);
                        i++;
                    } else {
                        gemischteListe.add(o2);
                        j++;
                    }
                }
            }
        }

        while (i < linkeListe.size()) {
            gemischteListe.add(linkeListe.get(i));
            i++;
        }
        while (j < rechteListe.size()) {
            gemischteListe.add(rechteListe.get(j));
            j++;
        }

        return gemischteListe;
    }

    public static List<TreeNode> extractLeaves(TreeNode root) {
        List<TreeNode> leaves = new ArrayList<>();
        extractLeavesRecursive(root, leaves);
        return leaves;
    }
    private static void extractLeavesRecursive(TreeNode node, List<TreeNode> leaves) {
        if (node == null) {
            return;
        }

        if (node.isLeaf()) {
            leaves.add(node); 
        } else {
            for (TreeNode child : node.getChildren()) {
                extractLeavesRecursive(child, leaves);
            }
        }
    }




    public static void main(String[] args) {
        List<Integer> list = List.of(1,3,6,6);
        System.out.println(mittelWertBerechnung(list));
        System.out.println(sumAllElems(list));
        List<String> listAlp = new ArrayList<>();
        listAlp.add("Hoi");
        listAlp.add("A");
        listAlp.add("C");
        listAlp.add("B");
        System.out.println(sortiereAlphabetischRekursiv(listAlp));

        List<Objekt> objektList = new ArrayList<>();
        objektList.add(new Objekt(new Date(2024 - 1900, 1, 1), 2, "B"));
        objektList.add(new Objekt(new Date(2024 - 1900, 1, 1), 1, "A"));
        objektList.add(new Objekt(new Date(2023 - 1900, 1, 1), 1, "C"));

        List<Objekt> sortierteListe = sortiereListe(objektList);

        for (Objekt objekt : sortierteListe) {
            System.out.println(objekt.getDatum() + " - " + objekt.getPrioritaet() + " - " + objekt.getTitel());
        }

        TreeNode root = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);

        root.addChild(node2);
        root.addChild(node3);
        node2.addChild(node4);
        node3.addChild(node5);

        List<TreeNode> leaves = extractLeaves(root);

        System.out.println("Blätter:");
        for (TreeNode leaf : leaves) {
            System.out.println("Wert: " + leaf.value);
        }
    }
    }