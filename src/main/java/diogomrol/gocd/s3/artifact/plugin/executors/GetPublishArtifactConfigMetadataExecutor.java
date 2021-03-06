/*
 * Copyright 2018 ThoughtWorks, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package diogomrol.gocd.s3.artifact.plugin.executors;

import diogomrol.gocd.s3.artifact.plugin.annotation.ConfigMetadata;
import diogomrol.gocd.s3.artifact.plugin.annotation.MetadataHelper;
import diogomrol.gocd.s3.artifact.plugin.model.S3FileArtifactPlanConfig;
import diogomrol.gocd.s3.artifact.plugin.utils.Util;
import com.thoughtworks.go.plugin.api.response.DefaultGoPluginApiResponse;
import com.thoughtworks.go.plugin.api.response.GoPluginApiResponse;

import java.util.List;

public class GetPublishArtifactConfigMetadataExecutor implements RequestExecutor {

    public GoPluginApiResponse execute() {
        final List<ConfigMetadata> metadata = MetadataHelper.getMetadata(S3FileArtifactPlanConfig.class);
        return DefaultGoPluginApiResponse.success(Util.GSON.toJson(metadata));
    }
}
