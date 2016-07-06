/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socialmedia;



/**
 *
 * @author John Krieger
 */
public class youTubeAdadpter implements SocialMediaEntry{
    private String user;
    private String postText;
    
    public youTubeAdadpter(){
    user = null;
    postText = null;
    }

    public youTubeAdadpter(YouTubeVideo youTube){
    user = youTube.getAuthor();
    postText = youTube.getTitle()+ " " + youTube.getDescription();
    }
    
    @Override
    public String getUser() {
        return user;
    }

    @Override
    public String getPostText() {
        return postText;
    }
    
}
