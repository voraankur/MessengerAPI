package org.ankur.restexample.messenger.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/")
public class CommentResource {
	
	@GET
	@Path("/{commentId}")
	public String getCommentAndMessageIds(@PathParam ("commentId") long commentId,
											@PathParam("messageId") long messageId) {
		return "Comment id is "+ commentId + " Message id is " + messageId;
	}
}
