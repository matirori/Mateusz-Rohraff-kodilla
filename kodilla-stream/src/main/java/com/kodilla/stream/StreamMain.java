package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {

      /*  PoemBeautifer poemBeautifer = new PoemBeautifer();
        poemBeautifer.beautify("Witam w Wejherowie", (text -> "ABC " + text + " ABC"));
        poemBeautifer.beautify("Witam w Wejherowie", (text -> toUpperCase(text)));
        poemBeautifer.beautify("Witam w Wejherowie", (text -> text.replaceAll("Wejherowie", "Gdyni ")));
        poemBeautifer.beautify("Witam w Wejherowie", (text -> (Arrays.toString(text.split(" ", text.length()))).replaceAll("\\[|\\]", "")));
        poemBeautifer.beautify("Witam w Wejherowie", (text -> toLowerCase(text)));
*/
        Forum forum = new Forum();

        Map<Integer, ForumUser> theMapOfForumUsers = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'f')
                .filter(forumUser -> forumUser.getUserAge() > 20)
                .filter(forumUser -> forumUser.getQuantityOfPublishedPosts() > 1)
                .collect(Collectors.toMap(ForumUser::getId, v -> v ));

        theMapOfForumUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
//    }
}}
